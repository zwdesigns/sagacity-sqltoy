/**
 *@Generated by sagacity-quickvo 4.0
 */
package com.sagframe.sqltoy.showcase.vo;

import java.time.LocalDateTime;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;

import com.sagframe.sqltoy.showcase.vo.base.AbstractDictDetailVO;

/**
 * @project sqltoy-showcase
 * @author zhongxuchen
 * @version 1.0.0
 * Table: sqltoy_dict_detail,Remark:字典明细表 	
 */
@SqlToyEntity
public class DictDetailVO extends AbstractDictDetailVO {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6197361592098673273L;
	
	/** default constructor */
	public DictDetailVO() {
		super();
	}
	
	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public DictDetailVO(String dictKey,String dictType)
	{
		this.dictKey=dictKey;
		this.dictType=dictType;
	}


	/** full constructor */
	public DictDetailVO(String dictKey,String dictType,String dictName,Integer showIndex,String updateBy,LocalDateTime updateTime,Integer status)
	{
		this.dictKey=dictKey;
		this.dictType=dictType;
		this.dictName=dictName;
		this.showIndex=showIndex;
		this.updateBy=updateBy;
		this.updateTime=updateTime;
		this.status=status;
	}

	/*---end-constructor-area---don't-update-this-area--*/
	
	/**
     *@todo vo columns to String
     */
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	public DictDetailVO clone() {
		try {
			// TODO Auto-generated method stub
			return (DictDetailVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
