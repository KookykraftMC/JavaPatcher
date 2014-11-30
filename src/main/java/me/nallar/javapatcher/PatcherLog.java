package me.nallar.javapatcher;


import java.util.logging.Logger;

/**
 * For internal use only, used to Log patcher errors/warnings/info.
 */
@SuppressWarnings("UnusedDeclaration")
public class PatcherLog {
	/*
	 * This class might get classloaded twice under different classloaders. Don't do anything important in a static {} block.
	 */
	public static final Logger LOGGER = java.util.logging.Logger.getLogger("JavaPatcher");

	public static void error(String msg) {
		LOGGER.severe(msg);
	}

	public static void warn(String msg) {
		LOGGER.warning(msg);
	}

	public static void info(String msg) {
		LOGGER.info(msg);
	}

	public static void trace(String msg) {
		LOGGER.finest(msg);
	}

	public static void error(String msg, Throwable t) {
		LOGGER.log(java.util.logging.Level.SEVERE, msg, t);
	}

	public static void warn(String msg, Throwable t) {
		LOGGER.log(java.util.logging.Level.WARNING, msg, t);
	}

	public static void info(String msg, Throwable t) {
		LOGGER.log(java.util.logging.Level.INFO, msg, t);
	}

	public static void trace(String msg, Throwable t) {
		LOGGER.log(java.util.logging.Level.FINEST, msg, t);
	}

	public static String classString(Object o) {
		return "c " + o.getClass().getName() + ' ';
	}

	public static void log(java.util.logging.Level level, Throwable throwable, String s) {
		LOGGER.log(level, s, throwable);
	}
}
