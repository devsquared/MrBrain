package com.MrBrain.SignalCollectors;

import com.MrBrain.NeuralNetwork.NeuronConnection;
import com.MrBrain.NeuralNetwork.SignalCollectors.ProductUnitSignalCollector;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ProductUnitSignalCollectorTest
{
	/**
	 * Test the collection of previous layer's output.
	 */
	@Test
	public void collectPrevLayerOutputTest()
	{
		NeuronConnection c1 = mock(NeuronConnection.class);
		NeuronConnection c2 = mock(NeuronConnection.class);
		NeuronConnection c3 = mock(NeuronConnection.class);

		when(c1.getInput()).thenReturn(2.0);
		when(c2.getInput()).thenReturn(12.0);
		when(c3.getInput()).thenReturn(-2.0);

		when(c1.getWeight()).thenReturn(0.5);
		when(c2.getWeight()).thenReturn(1.0);
		when(c3.getWeight()).thenReturn(-10.0);


		List<NeuronConnection> connections = new ArrayList<>();
		connections.add(c1);
		connections.add(c2);
		connections.add(c3);

		ProductUnitSignalCollector collector = new ProductUnitSignalCollector();
		double output = collector.collectPrevLayerOutput(connections);

		assertEquals(0.01657281518406, output, 0.00000000000001);
	}

}
