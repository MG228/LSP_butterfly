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
			map.put(genre, song);
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
	
	
	
	
	
	
	
}

