import java.util.*;

class P07_DuplicateVoter {
    public static void main(String[] args) {
        HashSet<String> voters = new HashSet<>();
        String[] incomingVotes = {"V1", "V2", "V3", "V1", "V4", "V5", "V6", "V2", "V7", "V3"};
        
        for (String v : incomingVotes) {
            if (!voters.add(v)) {
                System.out.println("Duplicate vote rejected: " + v);
            } else {
                System.out.println("Vote accepted: " + v);
            }
        }
        System.out.println("Total valid votes: " + voters.size());
        System.out.println("Contains V1? " + voters.contains("V1"));
    }
}