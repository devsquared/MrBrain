package com.MrBrain.Utilities.matrix;

import java.util.ArrayList;
import java.util.List;

abstract class Matrix
{
	private int[][] coreMatrix;
	private List<GraphNode> nodes;

	Matrix()
	{
		this.nodes = new ArrayList<>();
	}
}
