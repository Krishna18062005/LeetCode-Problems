class Pair {
    int source;
    int destination;
    int timeStamp;

    Pair(int source, int destination, int timeStamp) {
        this.source = source;
        this.destination = destination;
        this.timeStamp = timeStamp;
    }
}


class Router {
    Queue<Pair> q;
    Set<String> set;
    Map<Integer, List<Integer>> destMap;
    int size;

    public Router(int memoryLimit) {
        q = new LinkedList<>();
        set = new HashSet<>();
        destMap = new HashMap<>();
        size = memoryLimit;
    }
    
    public boolean addPacket(int source, int destination, int timestamp) {
        String key = source + "#" + destination + "#" + timestamp;
        if(set.contains(key)) return false;

        q.offer(new Pair(source, destination, timestamp));
        set.add(key);

        destMap.putIfAbsent(destination, new ArrayList<>());
        destMap.get(destination).add(timestamp);

        if(q.size() > size) {
            Pair removed = q.poll();
            String oldKey = removed.source + "#" + removed.destination + "#" + removed.timeStamp;
            set.remove(oldKey);

            List<Integer> list = destMap.get(removed.destination);
            list.remove(0);
            if(list.isEmpty()) {
                destMap.remove(removed.destination);
            }
        }
        return true;
    }
    
    public int[] forwardPacket() {
        if(!q.isEmpty()) {
            Pair p = q.poll();
            String oldKey = p.source + "#" + p.destination + "#" + p.timeStamp;
            set.remove(oldKey);

            List<Integer> list = destMap.get(p.destination);
            list.remove(0);
            if(list.isEmpty()) destMap.remove(p.destination);
            return new int[]{p.source, p.destination, p.timeStamp};
        }
        return new int[]{};
    }
    
    public int getCount(int destination, int startTime, int endTime) {
        if(!destMap.containsKey(destination)) return 0;
        List<Integer> list = destMap.get(destination);

        int left = lowerBound(list, startTime);
        int right = upperBound(list, endTime);

        return (left <= right) ? (right - left + 1) : 0;
    }

    public int lowerBound(List<Integer> list, int time) {
        int low = 0;
        int high = list.size() - 1;
        int ans = list.size();

        while(low <= high) {
            int mid = (low + high) / 2;
            if(list.get(mid) >= time) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int upperBound(List<Integer> list, int time) {
        int low = 0;
        int high = list.size() - 1;
        int ans = -1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(list.get(mid) > time) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }
}

