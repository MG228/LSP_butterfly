/* Name: Maya Griffin
 * Date : April 27, 2023
 * 
 */
package howard.edu.lsp.finals.document;


import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert;


public class SongDataBase {
	private Map<String, HashSet<String>> map = new HashMap <String, HashSet<String>>();
	
	public void ASong(String songtitle, String genre) {
		HashSet<String> song = map.get(genre);
		if (song == null) {
			song = new HashSet<String>();
			map.put(song, genre);
		}
		song.add(songtitle);
	}
	
	public Set<String> songg(String genre) {
		HashSet<String> song = map.get(genre);
		if (song == null) {
			song = new HashSet<String>();
		}
		return song;
	}
	
	// 
	public String genresong(String songT) {
		for (Map.Entry<String, HashSet<String>> entry: map.entrySet()) {
			if (entry.getValue().contains(songT)) {
				return entry.getKey();
			}
		}
		return null;
	}
	
	@Test
	public void testAsong() {
		SongDataBase db = new SongDataBase();
		db.Asong("Black", "Rap");
		db.Asong("Heard It All Before", "RnB");
		db.Asong("Best in Me", "Gospel");
		
		Set<String> Rapsong = db.songg("Rap");
		Assert.assertTrue(Rapsong.contains("Black"));
		
		Set<String> RnBsong = db.songg("RnB");
		Assert.assertTrue(RnBsong.contains("Heard It All Before"));
		
		Set<String> Gospelsong = db.songg("Gospel");
		Assert.assertTrue(Gospelsong.contains("Best in Me"));
	}
	
    @Test
    public void testsongg() {
    	SongDataBase db = new SongDataBase();
		db.Asong("Black", "Rap");
		db.Asong("Heard It All Before", "RnB");
		db.Asong("Best in Me", "Gospel");

        Set<String> Rapsong = db.songg("Rap");
        Assert.assertEquals(1, Rapsong.size());

        Set<String> RnBsong = db.songg("RnB");
        Assert.assertEquals(1, RnBsong.size());
        
        Set<String> Gospelsong = db.songg("Gospel");
        Assert.assertEquals(1, Gospelsong.size());

        
        
    }
	
	
	
	
	
}

