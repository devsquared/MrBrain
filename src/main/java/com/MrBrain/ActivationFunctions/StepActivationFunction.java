package com.MrBrain.ActivationFunctions;

public class StepActivationFunction implements ActivationFunction
{
	private double threshold = 0d;

	@Override
	public double calculateOutput(double summedInput)
	{
		if (summedInput >= threshold)
		{
			return 1d;
		}
		else
		{
			return 0d;
		}
	}
}
