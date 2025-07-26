package com.javareboot.patterns;

// Singleton Pattern: only one instance exists.
// Ensures a single point of access for shared resources.
// Implementation: Private constructor and static instance.
public class Config {
    private static final Config INSTANCE = new Config();
    private Config() {}
    public static Config getInstance() { return INSTANCE; }
    public String getValue() { return "singleton-config"; }
}
