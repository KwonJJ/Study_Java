package sec02;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {
	private int Bno;
	private String title;
	private String content;
	private String writer;
	private Date date;

	public Board(int Bno, String title, String content, String writer, Date date) {
		this.Bno = Bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}

	public int getBno() {
		return Bno;
	}

	public void setBno(int Bno) {
		this.Bno = Bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
