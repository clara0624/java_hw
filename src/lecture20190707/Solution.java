package lecture20190707;

class Solution {
      public String solution(String s) {
          String answer = "";
          
          
          if(s.length()%2==0) { //���� ���ڿ��� ���̰� ¦�����
              answer = s.substring(s.length()/2-1, s.length()/2+1);//2���ڰ� ���´�
          } else { //���ڿ��� ���̰� Ȧ�����
              answer = s.substring(s.length()/2,s.length()/2+1); //1���ڰ� ���´�
          }
          
          return answer;
      }
    }
