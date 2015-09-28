package org.eclipse.viatra.dse.merge.ui.subversive;

import java.util.Collection;
import java.util.List;

public class SvnStringUtil {

    public static final String BEGIN = "<<<<<<< .mine";
    public static final String DIVIDER = "=======";
    public static final String END = ">>>>>>> .r";
    
    private SvnStringUtil() {
    }

    public static String calculateOriginal(List<String> lines) {
        Phase phase = Phase.OUT;
        for (int i = 0; i < lines.size(); i++) {
            switch (phase) {
            case OUT:
                if(lines.get(i).equals(BEGIN)) {
                    lines.remove(i);
                    i--;
                    phase = Phase.MINE;
                }
                break;
            case MINE:
                if(lines.get(i).equals(DIVIDER)) {
                    lines.remove(i);
                    i--;
                    phase = Phase.REMOTE;
                }
                break;
            case REMOTE:
                if(lines.get(i).startsWith(END)) {
                    phase = Phase.OUT;
                }
                lines.remove(i);
                i--;
                break;
            default:
                break;
            }
        }
        return concatenate(lines);
    }
    
    public enum Phase {
        MINE, REMOTE, OUT;
    }
    
    private static String concatenate(Collection<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String l : list) {
            stringBuilder.append(String.format(l+"%n"));
        }
        return stringBuilder.toString();
    }
}
