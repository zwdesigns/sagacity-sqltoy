/**
 *@Generated by sagacity-quickvo 4.6
 */
package com.sagframe.sqltoy.showcase.vo.base;

import java.io.Serializable;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalDate;


/**
 * @project sqltoy-showcase
 * @version 1.0.0
 * Table: sqltoy_trans_info_15d,Remark:支付交易流水表(15天表)   
 */
@Entity(tableName="sqltoy_trans_info_15d",pk_constraint="PRIMARY")
public abstract class AbstractTransInfo15dVO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //transId,transCode,transChannel,transAmt,status,resultCode,transTime,transDate,userId,cardNo
	 
	 //not null properties
	 //transId,transCode,transChannel,transAmt,status,resultCode,transTime,transDate,userId

	/**
	 * 
	 */
	private static final long serialVersionUID = 7255415338867569030L;
	
	/**
	 * 交易ID
	 */
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugin.id.DefaultIdGenerator")
	@Column(name="TRANS_ID",length=32L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String transId;
	
	/**
	 * 交易代码
	 */
	@Column(name="TRANS_CODE",length=20L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String transCode;
	
	/**
	 * 交易渠道
	 */
	@Column(name="TRANS_CHANNEL",length=20L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String transChannel;
	
	/**
	 * 交易金额
	 */
	@Column(name="TRANS_AMT",length=14L,type=java.sql.Types.DECIMAL,nullable=false)
	protected BigDecimal transAmt;
	
	/**
	 * 交易状态
	 */
	@Column(name="STATUS",length=1L,type=java.sql.Types.INTEGER,nullable=false)
	protected Integer status;
	
	/**
	 * 交易返回码
	 */
	@Column(name="RESULT_CODE",length=20L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String resultCode;
	
	/**
	 * 交易时间
	 */
	@Column(name="TRANS_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDateTime transTime;
	
	/**
	 * 交易日期
	 */
	@Column(name="TRANS_DATE",length=10L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDate transDate;
	
	/**
	 * 用户ID
	 */
	@Column(name="USER_ID",length=32L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String userId;
	
	/**
	 * 交易卡号
	 */
	@Column(name="CARD_NO",length=32L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String cardNo;
	


	/** default constructor */
	public AbstractTransInfo15dVO() {
	}
	
	/** pk constructor */
	public AbstractTransInfo15dVO(String transId)
	{
		this.transId=transId;
	}

	/** minimal constructor */
	public AbstractTransInfo15dVO(String transId,String transCode,String transChannel,BigDecimal transAmt,Integer status,String resultCode,LocalDateTime transTime,LocalDate transDate,String userId)
	{
		this.transId=transId;
		this.transCode=transCode;
		this.transChannel=transChannel;
		this.transAmt=transAmt;
		this.status=status;
		this.resultCode=resultCode;
		this.transTime=transTime;
		this.transDate=transDate;
		this.userId=userId;
	}

	/** full constructor */
	public AbstractTransInfo15dVO(String transId,String transCode,String transChannel,BigDecimal transAmt,Integer status,String resultCode,LocalDateTime transTime,LocalDate transDate,String userId,String cardNo)
	{
		this.transId=transId;
		this.transCode=transCode;
		this.transChannel=transChannel;
		this.transAmt=transAmt;
		this.status=status;
		this.resultCode=resultCode;
		this.transTime=transTime;
		this.transDate=transDate;
		this.userId=userId;
		this.cardNo=cardNo;
	}
	
	/**
	 *@param transId the transId to set
	 */
	public void setTransId(String transId) {
		this.transId=transId;
	}
		
	/**
	 *@return the TransId
	 */
	public String getTransId() {
	    return this.transId;
	}
	
	/**
	 *@param transCode the transCode to set
	 */
	public void setTransCode(String transCode) {
		this.transCode=transCode;
	}
		
	/**
	 *@return the TransCode
	 */
	public String getTransCode() {
	    return this.transCode;
	}
	
	/**
	 *@param transChannel the transChannel to set
	 */
	public void setTransChannel(String transChannel) {
		this.transChannel=transChannel;
	}
		
	/**
	 *@return the TransChannel
	 */
	public String getTransChannel() {
	    return this.transChannel;
	}
	
	/**
	 *@param transAmt the transAmt to set
	 */
	public void setTransAmt(BigDecimal transAmt) {
		this.transAmt=transAmt;
	}
		
	/**
	 *@return the TransAmt
	 */
	public BigDecimal getTransAmt() {
	    return this.transAmt;
	}
	
	/**
	 *@param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status=status;
	}
		
	/**
	 *@return the Status
	 */
	public Integer getStatus() {
	    return this.status;
	}
	
	/**
	 *@param resultCode the resultCode to set
	 */
	public void setResultCode(String resultCode) {
		this.resultCode=resultCode;
	}
		
	/**
	 *@return the ResultCode
	 */
	public String getResultCode() {
	    return this.resultCode;
	}
	
	/**
	 *@param transTime the transTime to set
	 */
	public void setTransTime(LocalDateTime transTime) {
		this.transTime=transTime;
	}
		
	/**
	 *@return the TransTime
	 */
	public LocalDateTime getTransTime() {
	    return this.transTime;
	}
	
	/**
	 *@param transDate the transDate to set
	 */
	public void setTransDate(LocalDate transDate) {
		this.transDate=transDate;
	}
		
	/**
	 *@return the TransDate
	 */
	public LocalDate getTransDate() {
	    return this.transDate;
	}
	
	/**
	 *@param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId=userId;
	}
		
	/**
	 *@return the UserId
	 */
	public String getUserId() {
	    return this.userId;
	}
	
	/**
	 *@param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo=cardNo;
	}
		
	/**
	 *@return the CardNo
	 */
	public String getCardNo() {
	    return this.cardNo;
	}



	/**
     * @todo vo columns to String
     */
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("transId=").append(getTransId()).append("\n");
		columnsBuffer.append("transCode=").append(getTransCode()).append("\n");
		columnsBuffer.append("transChannel=").append(getTransChannel()).append("\n");
		columnsBuffer.append("transAmt=").append(getTransAmt()).append("\n");
		columnsBuffer.append("status=").append(getStatus()).append("\n");
		columnsBuffer.append("resultCode=").append(getResultCode()).append("\n");
		columnsBuffer.append("transTime=").append(getTransTime()).append("\n");
		columnsBuffer.append("transDate=").append(getTransDate()).append("\n");
		columnsBuffer.append("userId=").append(getUserId()).append("\n");
		columnsBuffer.append("cardNo=").append(getCardNo()).append("\n");
		return columnsBuffer.toString();
	}
}
