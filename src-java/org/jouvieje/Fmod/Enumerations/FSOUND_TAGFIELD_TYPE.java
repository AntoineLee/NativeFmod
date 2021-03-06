/**
 * 				NativeFmod Project
 *
 * Want to use FMOD API (www.fmod.org) in the Java language ? NativeFmod is made for you.
 * Copyright � 2004-2007 J�r�me JOUVIE (Jouvieje)
 *
 * Created on 28 avr. 2004
 * @version NativeFmod v3.4 (for FMOD v3.75)
 * @author J�r�me JOUVIE (Jouvieje)
 *
 *
 * WANT TO CONTACT ME ?
 * E-mail :
 * 		jerome.jouvie@gmail.com
 * My web sites :
 * 		http://jerome.jouvie.free.fr/
 *
 *
 * INTRODUCTION
 * Fmod is an API (Application Programming Interface) that allow you to use music
 * and creating sound effects with a lot of sort of musics.
 * Fmod is at :
 * 		http://www.fmod.org/
 * The reason of this project is that Fmod can't be used in Java direcly, so I've created
 * NativeFmod project.
 *
 *
 * GNU LESSER GENERAL PUBLIC LICENSE
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1 of the License,
 * or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the
 * Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307 USA
 */

package org.jouvieje.Fmod.Enumerations;

/**
 * Describes the type of a particular tag field.
 */
public interface FSOUND_TAGFIELD_TYPE
{
	/**A vorbis comment*/
	public final static int FSOUND_TAGFIELD_VORBISCOMMENT = EnumerationJNI.get_FSOUND_TAGFIELD_VORBISCOMMENT();
	/**Part of an ID3v1 tag*/
	public final static int FSOUND_TAGFIELD_ID3V1 = EnumerationJNI.get_FSOUND_TAGFIELD_ID3V1();
	/**An ID3v2 frame*/
	public final static int FSOUND_TAGFIELD_ID3V2 = EnumerationJNI.get_FSOUND_TAGFIELD_ID3V2();
	/**A SHOUTcast header line*/
	public final static int FSOUND_TAGFIELD_SHOUTCAST = EnumerationJNI.get_FSOUND_TAGFIELD_SHOUTCAST();
	/**An Icecast header line*/
	public final static int FSOUND_TAGFIELD_ICECAST = EnumerationJNI.get_FSOUND_TAGFIELD_ICECAST();
	/**An Advanced Streaming Format header line*/
	public final static int FSOUND_TAGFIELD_ASF = EnumerationJNI.get_FSOUND_TAGFIELD_ASF();
}