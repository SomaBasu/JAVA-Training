package com.java.globalsoftwaresupport;

import java.sql.Connection;

public interface Database {
	public Connection connect();
	public void disconnect();
}
