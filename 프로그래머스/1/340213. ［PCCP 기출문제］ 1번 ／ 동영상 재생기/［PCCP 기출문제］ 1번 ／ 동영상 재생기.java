import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        Map<String, Integer> target = new HashMap<String, Integer>();
        target.put("min", Integer.parseInt(pos.substring(0,2)));
        target.put("sec", Integer.parseInt(pos.substring(3,5)));
        isOpenning(target, op_start, op_end);
        
        for(String cmd : commands) {
            
            switch(cmd) {
                case "prev" -> {
                    prev(target);
                    isOpenning(target, op_start, op_end);
                }
                case "next" -> {
                    next(target, video_len);
                    isOpenning(target, op_start, op_end);
                }
            }
        }
        
        String answer = transIntToString(target.get("min")) + ":" + transIntToString(target.get("sec"));
        return answer;
    }
    
    private String transIntToString(int target) {
        
        if(target < 10) {
            return "0" + target;
        }
        return target + "";
    }
    
    private Map<String, Integer> prev(Map<String, Integer> pos) {
        
        if(pos.get("min") == 0) {
            
            if(pos.get("sec") <= 10) {
                
                pos.put("sec", 0);
                return pos;
            }
            
            pos.put("sec", pos.get("sec") - 10);
            
            return pos;
        }
        
        if(pos.get("sec") < 10) {
            
            pos.put("min", pos.get("min") - 1);
            pos.put("sec", pos.get("sec") + 60 - 10);
            
            return pos;
        }
        pos.put("sec", pos.get("sec") - 10);
        
        return pos;
    }
    
    private Map<String, Integer> next(Map<String, Integer> pos, String video_len) {
        
        if(pos.get("sec") >= 50) {
            
            pos.put("min", pos.get("min") + 1);
            pos.put("sec", pos.get("sec") - 60 + 10);
            
            return isOverLen(pos, video_len);
        }
        
        pos.put("sec", pos.get("sec") + 10);
        
        return isOverLen(pos, video_len);
    }
    
    private Map<String, Integer> isOverLen(Map<String, Integer> pos, String video_len) {
        
        int maxMin = Integer.parseInt(video_len.substring(0,2));
        int maxSec = Integer.parseInt(video_len.substring(3,5));
        
        if(pos.get("min") < maxMin) return pos;
        
        if(pos.get("min") == maxMin && pos.get("sec") < maxSec) return pos;
        
        pos.put("min", maxMin);
        pos.put("sec", maxSec);
        
        return pos;
    }
    
    private Map<String, Integer> isOpenning(Map<String, Integer> pos, String op_start, String op_end) {
        
        int startMin = Integer.parseInt(op_start.substring(0,2));
        int startSec = Integer.parseInt(op_start.substring(3,5));
        int endMin = Integer.parseInt(op_end.substring(0,2));
        int endSec = Integer.parseInt(op_end.substring(3,5));
        
        if(pos.get("min") < startMin || pos.get("min") > endMin) return pos;
        
        if(pos.get("min") == startMin) {
            
            if(pos.get("sec") < startSec) return pos;
        }
        
        if(pos.get("min") == endMin) {
            
            if(pos.get("sec") > endSec) return pos;
        }
        
        pos.put("min", endMin);
        pos.put("sec", endSec);
        
        return pos;
    }
}