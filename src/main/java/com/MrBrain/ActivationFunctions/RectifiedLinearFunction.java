package main.java.com.MrBrain.ActivationFunctions;

public class RectifiedLinearFunction implements ActivationFunction
{
	@Override
	public double calculateOutput(double summedInput)
	{
		return Math.max(0, summedInput);
	}
}
