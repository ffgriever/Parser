package com.ef;

public class Constants 
{
	//Codewise constants
	public static final String ARGUMENT_ACCESSLOG = "accesslog";
	public static final String ARGUMENT_STARTDATE = "startDate";
	public static final String ARGUMENT_DURATION = "duration";
	public static final String ARGUMENT_THRESHOLD = "threshold";
	
	public static final String DURATION_HOURLY = "hourly";
	public static final String DURATION_DAILY = "daily";
	public static final String STARTDATE_FORMAT = "yyyy-MM-dd.HH:mm:ss";
	
	public static final char LOG_DATA_SEPARATOR = '|';
	
	public static final String MYSQL_DRIVER_NAME = "com.mysql.jdbc.Driver";
	public static final String MYSQL_SERVER_NAME = "localhost";
	public static final String MYSQL_DATABASE_NAME = "parser";
	public static final String MYSQL_DATABASE_URL = "jdbc:mysql://" + MYSQL_SERVER_NAME + "/" + MYSQL_DATABASE_NAME;
	public static final String MYSQL_USERNAME = "root";
	public static final String MYSQL_PASSWORD = "root";
	
	public static final int LOG_ARRAY_DATA_POS_TIMESTAMP  = 0;
	public static final int LOG_ARRAY_DATA_POS_IP         = 1;
	public static final int LOG_ARRAY_DATA_POS_REQUEST    = 2;
	public static final int LOG_ARRAY_DATA_POS_STATUS     = 3;
	public static final int LOG_ARRAY_DATA_POS_USER_AGENT = 4;
	
	//Message constants
	public static final String ARGUMENT_ACCESSLOG_DESC = "Path to file to be parsed";
	public static final String ARGUMENT_STARTDATE_DESC = "Connection start date (format: " + Constants.STARTDATE_FORMAT + ")";
	public static final String ARGUMENT_DURATION_DESC  = "Connection duration (" + Constants.DURATION_HOURLY + " or " + Constants.DURATION_DAILY + ")";
	public static final String ARGUMENT_THRESHOLD_DESC = "Requests threshold";
	
	public static final String ERROR_PREFIX = "Input parameters error"; 
	public static final String ERROR_INVALID_DURATION = "Duration parameter invalid:";
	public static final String ERROR_INVALID_THRESHOLD = "Threshold parameter is not an integer:";
}
