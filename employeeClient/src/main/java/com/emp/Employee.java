package com.emp;

public class Employee {
	
    public Employee(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public Employee() {
		id = 0;
		content = null;
	}

	private final long id;
    private final String content;

   
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
