/** @file
 * Copyright (C) 2004 John D Lamb (J.D.Lamb@btinternet.com)
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

package calculator.pobject;

/**
 * Unary minus operation. This is not currently used directly but Parser
 * uses it internally to replace Subtract objects where appropriate.
 *
 * @author J. D. Lamb 
 * @version 1.0
 */
public class Uminus extends RFunction {
    /**
     * Constructor. Sets a tooltip and shortcut.
     */
    public Uminus(){
    }

    /**
     * Changes sign of next element x.
     * @param x The value (right of symbol)
     * @return The result of the operation
     */
    public double function( double x ){
	return -x;
    }

    public java.lang.String[] name_array(){
	return fname;
    }
    
    public static void main( java.lang.String args[] ){
	PObject o = new Uminus();
	java.lang.StringBuffer s = new java.lang.StringBuffer( "<html>" );
	s.append( o.name() );
	s.append( "</html>" );
	javax.swing.JOptionPane.showMessageDialog( null, s.toString() );
    }
    
    private final static java.lang.String[] fname = { "(&#8722;)" };
}
