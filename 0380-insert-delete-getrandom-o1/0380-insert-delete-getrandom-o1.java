class RandomizedSet {

    HashSet<Integer> set;
    ArrayList<Integer> list;

    public RandomizedSet() {
        set = new HashSet<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {

        if (set.contains(val)) {
            return false;
        }

        set.add(val);
        list.add(val);

        return true;
    }

    public boolean remove(int val) {

        if (!set.contains(val)) {
            return false;
        }

        set.remove(val);
        int index = list.indexOf(val);
        int last = list.get(list.size() - 1);

        list.set(index, last);
        list.remove(list.size() - 1);
        return true;
    }

    public int getRandom() {

        int randomIndex = (int)(Math.random() * list.size());

        return list.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */