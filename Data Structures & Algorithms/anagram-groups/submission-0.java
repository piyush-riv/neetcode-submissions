class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char car[]=s.toCharArray();
            Arrays.sort(car);
            String sortedS = new String(car);

            if(!map.containsKey(sortedS)){
                map.put(sortedS,new ArrayList<>());
            }
            map.get(sortedS).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
