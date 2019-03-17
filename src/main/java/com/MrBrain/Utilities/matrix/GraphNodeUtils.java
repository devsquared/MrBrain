package com.MrBrain.Utilities.matrix;

class GraphNodeUtils
{
	/**
	 * Here we create the composite key. This is simply Rx:Cy where x is the number of row and c is the integer of column.
	 * <br> Example: for the node at Row 3 Column 5, our composite key will be R3:C5.
	 */
	static String createCompKey(int row, int column)
	{
		return "R" + row + ":C" + column;
	}
}
