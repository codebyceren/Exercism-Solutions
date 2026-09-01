import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

class RelativeDistance {
    private Map<String, Set<String>> family = new HashMap<>();

    RelativeDistance(Map<String, List<String>> familyTree) {

    for (Map.Entry<String, List<String>> entry : familyTree.entrySet()) {

        String parent = entry.getKey();
        List<String> children = entry.getValue();

        if (!family.containsKey(parent)) {
            family.put(parent, new HashSet<>());
        }

        for (String child : children) {

            if (!family.containsKey(child)) {
                family.put(child, new HashSet<>());
            }

            // parent ve child birbirine bağlanıyor
            family.get(parent).add(child);
            family.get(child).add(parent);
        }

        // Aynı parent'ın çocuklarını birbirine bağlıyoruz
        for (String child1 : children) {
            for (String child2 : children) {

                if (!child1.equals(child2)) {
                    family.get(child1).add(child2);
                }
            }
        }
    }
}
    int degreeOfSeparation(String personA, String personB) {
        if (personA.equals(personB)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> distances = new HashMap<>();

        queue.add(personA);
        distances.put(personA, 0);

        while (!queue.isEmpty()) {

            String currentPerson = queue.remove();
            int currentDistance = distances.get(currentPerson);

            for (String relative : family.getOrDefault(currentPerson, new HashSet<>())) {

                if (!distances.containsKey(relative)) {

                    int newDistance = currentDistance + 1;

                    if (relative.equals(personB)) {
                        return newDistance;
                    }

                    distances.put(relative, newDistance);
                    queue.add(relative);
                }
            }
        }

        return -1;
    }
}
