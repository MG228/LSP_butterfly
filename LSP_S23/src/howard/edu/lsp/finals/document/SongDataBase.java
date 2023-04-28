/* Name: Maya Griffin
 * Date : April 27, 2023
 * 
 */
package howard.edu.lsp.finals.document;


import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;


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
	
	
	
	
	
	
	
	
	
	
	
	
}

