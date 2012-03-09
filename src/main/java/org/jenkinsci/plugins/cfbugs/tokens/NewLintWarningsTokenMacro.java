package org.jenkinsci.plugins.cfbugs.tokens;

import hudson.plugins.analysis.tokens.AbstractNewAnnotationsTokenMacro;

import org.jenkinsci.plugins.cfbugs.LintMavenResultAction;
import org.jenkinsci.plugins.cfbugs.LintResultAction;

/** Provides a token that evaluates to the number of new CFBugs warnings. */
// @Extension(optional = true)
public class NewLintWarningsTokenMacro extends AbstractNewAnnotationsTokenMacro {

    @SuppressWarnings("unchecked")
    public NewLintWarningsTokenMacro() {
        super("ANDROID_LINT_NEW", LintResultAction.class, LintMavenResultAction.class);
    }

}
