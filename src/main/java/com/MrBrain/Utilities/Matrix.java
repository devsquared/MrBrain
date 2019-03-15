package com.MrBrain.Utilities;

import java.util.HashMap;
import java.util.Map;

// TODO: rewrite with graph nodes
public abstract class Matrix
{
	private int[][] coreMatrix;
	private Map<String, Integer> keyedEntries;

	public Matrix()
	{
		this.keyedEntries = new HashMap<>();
	}

	public Matrix(int[][] matrix)
	{
		this.coreMatrix = matrix;
	}

	public Matrix(Map<String, Integer> keyedEntries)
	{
		this.keyedEntries = keyedEntries;
	}

	public Matrix(int[][] matrix, Map<String, Integer> keyedEntries)
	{
		this.coreMatrix = matrix;
		this.keyedEntries = keyedEntries;
	}

}
