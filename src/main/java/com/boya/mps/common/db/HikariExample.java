package com.boya.mps.common.db;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariExample
{
		
		private static DataSource datasource;
		
		public static DataSource getDataSource()
		{
				if(datasource == null)
				{
					HikariConfig config = new HikariConfig();
					//config.setJdbcUrl("jdbc:postgresql://localhost:32768/postgres");
					config.setDataSourceClassName("org.postgresql.ds.PGPoolingDataSource");
					config.setUsername("postgres");
					config.setPassword("");
					config.addDataSourceProperty("portNumber", "32768");
					//config.addDataSourceProperty("cachePrepStmts", "true");
					//config.addDataSourceProperty("prepStmtCacheSize", "250");
					config.addDataSourceProperty("MaxConnections", "10");
			        
			        datasource = new HikariDataSource(config);
				}
				
				return datasource;
		}
		
		public static void main(String[] args)
		{
				      
        Connection connection = null;
				PreparedStatement pstmt = null;
				ResultSet resultSet = null;
				try
				{
						DataSource dataSource = HikariExample.getDataSource();
						connection = dataSource.getConnection();
						pstmt = connection.prepareStatement("SELECT * FROM public.user");
						
						System.out.println("The Connection Object is of Class: " + connection.getClass());
						
						resultSet = pstmt.executeQuery();
						if(null == resultSet)
							System.out.println("null result");
						else
							while (resultSet.next())
							{
									System.out.println(resultSet.getString(1) + "," + resultSet.getString(2) + "," + resultSet.getString(3));
							}

				}
				catch (Exception e)
				{
						e.printStackTrace();
						try
						{
								connection.rollback();
						}
						catch (SQLException e1)
						{
								e1.printStackTrace();
						}
						e.printStackTrace();
				}
        
		}

}
