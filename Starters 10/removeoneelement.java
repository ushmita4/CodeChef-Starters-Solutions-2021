if(m1 != m2){
                    if(m1 > 0) {
                        if (mp.containsKey(m1)) mp.put(m1, mp.get(m1) + 1);
                        else mp.put(m1, 1);
                    }
                    if(m2 > 0) {
                        if (mp.containsKey(m2)) mp.put(m2, mp.get(m2) + 1);
                        else mp.put(m2, 1);
                    }
                }else{
                    if(m1 > 0) {
                        if (mp.containsKey(m1)) mp.put(m1, mp.get(m1) + 1);
                        else mp.put(m1, 1);
                    }
                }
            }

            long ans = Integer.MAX_VALUE;

            for(long k : mp.keySet()){
                if(mp.get(k) == n-1){
                    ans = Math.min(ans, k);
                }
            }

            System.out.println(ans);
        }
	}
}
