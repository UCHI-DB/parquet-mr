package org.apache.parquet.column.impl;

import java.nio.ByteBuffer;

import org.apache.parquet.column.Dictionary;
import org.apache.parquet.column.Encoding;

public class OffheapReadSopport {
	private Encoding dataEncoding;
	private ByteBuffer bytes;
	private long startPos;
	private int valueCount;
	private int offset;
	private Dictionary dictionary;
	public OffheapReadSopport(Encoding dataEncoding, ByteBuffer bytes, int offset, int valueCount, long startPos, Dictionary dictionary) {
		this.dataEncoding = dataEncoding;
		this.bytes = bytes;
		this.offset = offset;
		this.valueCount = valueCount;
		this.startPos = startPos;
		this.dictionary = dictionary;
		
	}
	public Encoding getDataEncoding() {
		return dataEncoding;
	}
	public void setDataEncoding(Encoding dataEncoding) {
		this.dataEncoding = dataEncoding;
	}
	public ByteBuffer getBytes() {
		return bytes;
	}
	public void setBytes(ByteBuffer bytes) {
		this.bytes = bytes;
	}
	public long getStartPos() {
		return startPos;
	}
	public void setStartPos(long startPos) {
		this.startPos = startPos;
	}
	public int getValueCount() {
		return valueCount;
	}
	public void setValueCount(int valueCount) {
		this.valueCount = valueCount;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public Dictionary getDictionary() {
		return dictionary;
	}
	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}

}
