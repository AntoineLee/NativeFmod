/**
 * Based on Fmod examples.
 * 
 * @author J�r�me JOUVIE (Jouvieje)
 * 
 * WANT TO CONTACT ME ?
 * @author J�r�me JOUVIE (Jouvieje)
 * @site   http://jerome.jouvie.free.fr/
 * @mail   jerome.jouvie@gmail.com
 */

package org.jouvieje.Fmod.FileFormat.WavFormat;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

import org.jouvieje.Fmod.Misc.FileWriterUtils;
import org.jouvieje.Fmod.Misc.BufferUtils;

public class RiffChunk
{
	public final static int SIZEOF_RIFF_CHUNK = 4 * BufferUtils.SIZEOF_BYTE + BufferUtils.SIZEOF_INT;
	
	private byte[] id = null;		//byte[4]
	private int size = -1;
	
	public RiffChunk(byte[] id, int size)
	{
		this.id = id;
		this.size = size;
	}
	
	public byte[] getId()
	{
		return id;
	}
	public void setId(byte[] id)
	{
		this.id = id;
	}
	
	public int getSize()
	{
		return size;
	}
	public void setSize(int size)
	{
		this.size = size;
	}
	
	/**
	 * Write an <Code>RiffChunk</code> object into a file.
	 * @param file a file to write in.
	 * @param riffChunk a <code>RiffChunk</code> object.
	 */
	public static void writeRiffChunk(RandomAccessFile file, RiffChunk riffChunk) throws IOException
	{
		FileWriterUtils.writeByteArray(file, riffChunk.getId());
		FileWriterUtils.writeInt(file, riffChunk.getSize());
	}
	public static void putRiffChunk(ByteBuffer buffer, RiffChunk riffChunk)
	{
		buffer.put(riffChunk.getId());
		buffer.putInt(riffChunk.getSize());
	}
}