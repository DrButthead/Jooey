package com.jooey.parser;

import com.jooey.parser.arguments.Argument;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class JooeyParser {

	private List<Argument> arguments = new ArrayList<>();

	public JooeyParser() {
	}


	/**
	 *
	 * @param longName eg. --longname
	 * @param shortName eg. -s
	 * @param def eg.
	 * @param widget
	 */
	public void addArgument(String longName, String shortName, Object def, String widget) {

	}

	public void addArgument() {

	}

	public void addArgument(Argument arg) {
		this.arguments.add(arg);
	}

}
