package onboarding;

import java.util.*;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        Set<String> peopleSet = getPeopleSet(friends, visitors);
        Map<String, Set<String>> relationMap = getRelationMap(friends, peopleSet);
        return answer;
    }

    public static Set<String> getPeopleSet(List<List<String>> friends, List<String> visitors) {
        Set<String> set = new HashSet<>();
        for(List<String> l : friends) {
            set.addAll(l);
        }
        set.addAll(visitors);
        return set;
    }
    public static Set<String> getFriendSet(List<List<String>> friends, String name) {
        Set<String> friendSet = new HashSet<>();
        for(List<String> l : friends) {
            if(l.contains(name)) {
                friendSet.add(l.get(0));
                friendSet.add(l.get(1));
            }
        }
        friendSet.remove(name);
        return friendSet;
    }
    public static Map<String, Set<String>> getRelationMap(List<List<String>> friends, Set<String> peopleSet) {
        Map<String, Set<String>> relationMap = new HashMap<>();
        Set<String> friendSet;
        for(String s : peopleSet) {
            friendSet = getFriendSet(friends, s);
            relationMap.put(s, friendSet);
        }
        return relationMap;
    }
    public static int getFriendNumber(Map<String, Set<String>> relationMap, String friend, String user) {
        int number = 0;
        Set<String> friendSet = relationMap.get(friend);
        Set<String> usersf = relationMap.get(user);

        for(String s : usersf) {
            if(friendSet.contains(s)) {
                number =  number + 1;
            }
        }
        return number;
    }


}
