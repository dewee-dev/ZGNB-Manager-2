package jadx.gui.treemodel;

import org.fife.ui.rsyntaxtextarea.SyntaxConstants;

import jadx.api.JavaNode;

public abstract class JNode {


    public abstract JClass getJParent();

    /**
     * Return top level JClass or self if already at top.
     */
    public JClass getRootClass() {
        return null;
    }

    public JavaNode getJavaNode() {
        return null;
    }

    public String getContent() {
        return null;
    }

    public String getSyntaxName() {
        return SyntaxConstants.SYNTAX_STYLE_NONE;
    }

    public int getLine() {
        return 0;
    }

    public Integer getSourceLine(int line) {
        return null;
    }

    public abstract int getIcon();

    public String getName() {
        JavaNode javaNode = getJavaNode();
        if (javaNode == null) {
            return null;
        }
        return javaNode.getName();
    }

    public abstract String makeString();

    public String makeDescString() {
        return null;
    }

    public boolean hasDescString() {
        return false;
    }

    public String makeLongString() {
        return makeString();
    }

    @Override
    public String toString() {
        return makeString();
    }
}
