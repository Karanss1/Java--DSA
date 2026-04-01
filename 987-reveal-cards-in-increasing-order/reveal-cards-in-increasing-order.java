class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        int n = deck.length;
        int[] result = new int [n];
        Deque<Integer> index = new LinkedList<>();

        for(int i = 0; i< n; i++){
            index.add(i);
        }

        for(int card : deck){
            int idx = index.poll(); // this gives the number of left index
            result[idx] = card;
            if(!index.isEmpty()){
                index.add(index.poll()); // this moves to the used index to end of dequeu
            }
        }

        return result;
    }
}