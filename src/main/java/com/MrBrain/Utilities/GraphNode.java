package com.MrBrain.Utilities;

/**
 * This class gives us a base for graph theory and utilizing this for matrix math.
 *
 * @author Devin
 */
public class GraphNode
{
	private String rowKey;
	private String columnKey;
	private double value;

	public GraphNode()
	{
		// default constructor
	}

	public GraphNode(String row, String column)
	{
		this.rowKey = row;
		this.columnKey = column;
		this.value = 0;
	}

	public GraphNode(String row, String column, double value)
	{
		this.rowKey = row;
		this.columnKey = column;
		this.value = value;
	}

	public String getRowKey()
	{
		return rowKey;
	}

	public void setRowKey(String rowKey)
	{
		this.rowKey = rowKey;
	}

	public String getColumnKey()
	{
		return columnKey;
	}

	public void setColumnKey(String columnKey)
	{
		this.columnKey = columnKey;
	}

	public double getValue()
	{
		return value;
	}

	public void setValue(double value)
	{
		this.value = value;
	}
}
