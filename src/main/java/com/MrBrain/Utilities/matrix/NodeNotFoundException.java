package com.MrBrain.Utilities.matrix;

public class NodeNotFoundException extends Exception
{
	public NodeNotFoundException()
	{
		super("Could not find a node at the location queried for.");
	}

	NodeNotFoundException(String message)
	{
		super(message);
	}
}
