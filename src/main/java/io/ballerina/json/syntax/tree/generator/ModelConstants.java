package io.ballerina.json.syntax.tree.generator;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ModelConstants {

    public static final String DEFAULT_PACKAGE = "defaultPackage";
    public static final String DEFAULT_FILENAME = "main.bal";
    public static final String USER_DIR = "user.dir";
    public static final String BALLERINA_TOML = "Ballerina.toml";
    public static final String PKG_DEFAULTS = "pkg_defaults";
    public static final String ORG_NAME = "ORG_NAME";
    public static final String PKG_NAME = "PKG_NAME";
    public static final String DIST_VERSION = "DIST_VERSION";
    public static final String GITIGNORE_FILE_NAME = ".gitignore";
    public static final String GITIGNORE = "gitignore";
    public static final String DEVCONTAINER = "devcontainer";


    public static Path OUTPUT_PATH = Paths.get("src/main/resources", "output");

}
