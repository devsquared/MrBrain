package com.MrBrain.Utilities.matrix;

import static com.MrBrain.Utilities.matrix.GraphNodeUtils.createCompKey;

/**
 * This class gives us a base for graph theory and utilizing this for matrix math.
 * The lack of default constructor is intentional as we need to create a composite key with the row and column provided.
 *
 * @author Devin
 */
public class GraphNode
{
	private int rowKey;
	private int columnKey;
	private String compositeKey;
	private double value;

	public GraphNode(int row, int column)
	{
		this.rowKey = row;
		this.columnKey = column;
		this.compositeKey = createCompKey(row, column);
		this.value = 0;
	}

	public GraphNode(int row, int column, double value)
	{
		this.rowKey = row;
		this.columnKey = column;
		this.compositeKey = createCompKey(row, column);
		this.value = value;
	}

	int getRowKey()
	{
		return rowKey;
	}

	public void setRowKey(int rowKey)
	{
		this.rowKey = rowKey;
	}

	int getColumnKey()
	{
		return columnKey;
	}

	public void setColumnKey(int columnKey)
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

	String getCompositeKey()
	{
		return compositeKey;
	}
}
