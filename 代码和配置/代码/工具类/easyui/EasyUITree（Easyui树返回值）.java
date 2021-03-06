package com.sxt.model;

import java.io.Serializable;
import java.util.List;

public class EasyUITree implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;   // ：节点的 id，它对于加载远程数据很重要。
	private String text;      // ：要显示的节点文本。
	private String state;     // ：节点状态，'open' 或 'closed'，默认是 'open'。当设置为 'closed' 时，该节点有子节点，并且将从远程站点加载它们。
	private Boolean checked;   // ：指示节点是否被选中。
	private String attributes;// ：给一个节点添加的自定义属性。
	private List<EasyUITree> children;  // ：定义了一些子节点的节点数组。
	
	
	public EasyUITree() {}
	
	public EasyUITree(Integer id, String text, String state, Boolean checked, String attributes,
			List<EasyUITree> children) {
		super();
		this.id = id;
		this.text = text;
		this.state = state;
		this.checked = checked;
		this.attributes = attributes;
		this.children = children;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Boolean isChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public String getAttributes() {
		return attributes;
	}
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}
	public List<EasyUITree> getChildren() {
		return children;
	}
	public void setChildren(List<EasyUITree> children) {
		this.children = children;
	}
	
	
	

}
