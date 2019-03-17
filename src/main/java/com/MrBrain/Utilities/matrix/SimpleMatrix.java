package com.MrBrain.Utilities.matrix;

import org.apache.commons.lang3.Validate;

import java.util.ArrayList;
import java.util.List;

import static com.MrBrain.Utilities.matrix.GraphNodeUtils.createCompKey;

public class SimpleMatrix extends Matrix
{
	private int[][] coreMatrix;
	private List<GraphNode> allNodes;
	private List<List<GraphNode>> rowsOfNodes;
	private List<List<GraphNode>> columnsOfNodes;

	public SimpleMatrix(int[][] matrix)
	{
		this.coreMatrix = matrix;
	}

	public SimpleMatrix(List<GraphNode> allNodes)
	{
		this.allNodes = allNodes;
	}

	public SimpleMatrix(int[][] matrix, List<GraphNode> allNodes)
	{
		this.coreMatrix = matrix;
		this.allNodes = allNodes;
	}

	public int[][] getCoreMatrix()
	{
		return coreMatrix;
	}

	public void setCoreMatrix(int[][] coreMatrix)
	{
		this.coreMatrix = coreMatrix;
	}

	public List<GraphNode> getAllNodes()
	{
		return allNodes;
	}

	public void setAllNodes(List<GraphNode> allNodes)
	{
		this.allNodes = allNodes;
	}

	public void addNode(GraphNode node)
	{
		Validate.notNull(node);

		if (allNodes == null)
		{
			allNodes = new ArrayList<>();
		}

		allNodes.add(node);
	}

	public List<GraphNode> getNodesAtRow(int x) throws NodeNotFoundException
	{
		List<GraphNode> rowNodes = new ArrayList<>();

		for (GraphNode node : rowsOfNodes.get(x))
		{
			if (node.getRowKey() == x)
			{
				rowNodes.add(node);
			}
		}

		if (rowNodes.isEmpty())
		{
			throw new NodeNotFoundException("Could not found a node at row: " + x);
		}
		else
		{
			return rowNodes;
		}
	}

	public List<GraphNode> getNodesAtColumn(int y) throws NodeNotFoundException
	{
		List<GraphNode> columnNodes = new ArrayList<>();

		for (GraphNode node : columnsOfNodes.get(y))
		{
			if (node.getColumnKey() == y)
			{
				columnNodes.add(node);
			}
		}

		if (columnNodes.isEmpty())
		{
			throw new NodeNotFoundException("Could not found a node at column: " + y);
		}
		else
		{
			return columnNodes;
		}
	}

	public GraphNode getNodeAtLocation(int x, int y) throws NodeNotFoundException
	{
		String compKey = createCompKey(x, y);

		for (GraphNode node : allNodes)
		{
			if (compKey.equals(node.getCompositeKey()))
			{
				return node;
			}
		}

		throw new NodeNotFoundException("Could not find a node at row " + x + " and column " + y + ".");
	}

	public void setNodesAtRow(int x, List<GraphNode> newRow)
	{
		rowsOfNodes.set(x, newRow);
	}

	public void setNodesAtColumn(int y, List<GraphNode> newColumn)
	{
		columnsOfNodes.set(y, newColumn);
	}

	public List<GraphNode> getRow(int x)
	{
		return rowsOfNodes.get(x);
	}

	public List<GraphNode> getColumn(int y)
	{
		return columnsOfNodes.get(y);
	}
}
