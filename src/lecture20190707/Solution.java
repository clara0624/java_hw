package lecture20190707;

class Solution {
      public String solution(String s) {
          String answer = "";
          
          
          if(s.length()%2==0) { //만약 문자열의 길이가 짝수라면
              answer = s.substring(s.length()/2-1, s.length()/2+1);//2글자가 나온다
          } else { //문자열의 길이가 홀수라면
              answer = s.substring(s.length()/2,s.length()/2+1); //1글자가 나온다
          }
          
          return answer;
      }
    }
