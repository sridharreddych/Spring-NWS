package com.sree.design.test;

import com.sree.design.factory.ComputerFactory;
import com.sree.design.model.Computer;

public class TestFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "2 GB","500 GB"," 2.4 GHZ");
		Computer server= ComputerFactory.getComputer("server", "2 GB","2 TB"," 2.9 GHZ");
		System.out.println("Factory PC Config"+pc);
		System.out.println("Factory Server Config"+server);
	}
}
