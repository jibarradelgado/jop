/*
  This file is part of JOP, the Java Optimized Processor
    see <http://www.jopdesign.com/>

  Copyright (C) 2009, Martin Schoeberl (martin@jopdesign.com)

  This program is free software: you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation, either version 3 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/


/**
 * 
 */
package cache;

import com.jopdesign.sys.Native;

/**
 * @author Martin Schoeberl (martin@jopdesign.com)
 *
 */
public class OCache {
	
	int a, b;
	static int s;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		OCache oc = new OCache();
		int i, j;

		// a marker for the ModelSim simulation
		com.jopdesign.io.IOFactory.getFactory().getSysDevice().wd = 1;
		s = 15;
		
		oc.a = 1;
		i = oc.a;
		j = oc.a;
		int ref = Native.toInt(oc);
		Native.putField(ref, 0, 2);
		i = oc.a;
	}

}
