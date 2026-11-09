class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();

        for(int num : arr) {
            list.add(num);
        }

        Collections.sort(list, (a, b) -> {
            if(Math.abs(a-x) != Math.abs(b-x)) {
                return Math.abs(a-x) - Math.abs(b-x);
            }
            return a-b;
        });

        list = list.subList(0, k);

        Collections.sort(list);

        return list;
    }
}