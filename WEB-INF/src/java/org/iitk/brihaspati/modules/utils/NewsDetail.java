package org.iitk.brihaspati.modules.utils;

/*
 * @(#) NewsDetail.java
 *
 *  Copyright (c) 2005 ETRG,IIT Kanpur. 
 *  All Rights Reserved.
 *
 *  Redistribution and use in source and binary forms, with or 
 *  without modification, are permitted provided that the following 
 *  conditions are met:
 * 
 *  Redistributions of source code must retain the above copyright  
 *  notice, this  list of conditions and the following disclaimer.
 * 
 *  Redistribution in binary form must reproducuce the above copyright 
 *  notice, this list of conditions and the following disclaimer in 
 *  the documentation and/or other materials provided with the 
 *  distribution.
 * 
 * 
 *  THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *  DISCLAIMED.  IN NO EVENT SHALL ETRG OR ITS CONTRIBUTORS BE LIABLE
 *  FOR ANY DIRECT, INDIRECT, INCIDENTAL,SPECIAL, EXEMPLARY, OR 
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
 *  OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR 
 *  BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 *  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
 *  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 *  EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 *  
 *  Contributors: Members of ETRG, I.I.T. Kanpur 
 *
 */
/**
 * In this class,set or get details of news 
 *  @author <a href="awadhesh_trivedi@yahoo.co.in">Awadhesh Kumar Trivedi</a>
 */

public class NewsDetail 
{
	private String Sender;
	private String News_Subject;
	private String News_Id;
	private String PublishDate;
	private String Status;
	private String Rep_Status;
	
	public void setSender(String Sender)
	{
		this.Sender=Sender;
	}
	public String getSender()
	{
		return Sender;
	}
	public void setPDate(String PublishDate)
	{
		this.PublishDate=PublishDate;
	}
	public String getPDate()
	{
		return PublishDate;
	}
	public void setNews_Subject(String msg)
	{
		this.News_Subject=msg;
	}
	public String getNews_Subject()
	{
		return News_Subject;
	}
	public void setReplyStatus(String Re_status)
	{
		this.Rep_Status=Re_status;
	}
	public String getReplyStatus()
	{
		return Rep_Status;
	}
	public void setStatus(String status)
	{
		this.Status=status;
	}
	public String getStatus()
	{
		return Status;
	}
	public void setNews_ID(String nid)
	{
		this.News_Id=nid;
	}
	public String getNews_ID()
	{
		return News_Id;
	}
}
