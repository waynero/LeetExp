import java.util.*;

public class CourseSech {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++)
            graph[i] = new ArrayList();

        boolean[] visited = new boolean[numCourses];
        for(int i=0; i<prerequisites.length;i++){
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }

        for(int i=0; i<numCourses; i++){
            if(!dfs(graph,visited,i))
                return false;
        }
        return true;
    }

    private boolean dfs(ArrayList[] graph, boolean[] visited, int course){
        if(visited[course])
            return false;
        else
            visited[course] = true;;

        for(int i=0; i<graph[course].size();i++){
            if(!dfs(graph,visited,(int)graph[course].get(i)))
                return false;
        }
        visited[course] = false;
        return true;
    }
    public boolean canFinish1(int numCourses, int[][] prerequisites) {
        if(prerequisites == null || prerequisites.length == 0){
            return true;
        }
        ArrayList[] graph = new ArrayList[numCourses];
        int[] degree = new int[numCourses];
        int count = 0;
        for(int i = 0; i < numCourses; i++){
            graph[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < prerequisites.length; i++){
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
            degree[prerequisites[i][0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(degree[i] == 0){
                queue.offer(i);
                count++;
            }
        }
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int i = 0; i < graph[cur].size(); i++){
                int next =(int) graph[cur].get(i);
                degree[next]--;
                if(degree[next] == 0){
                    queue.offer(next);
                    count++;
                }
            }
        }
        if(count == numCourses){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        CourseSech impl = new CourseSech();
        int[][] array = {{1,0}, {1, 2}, {2, 1}};
        System.out.println(impl.canFinish1(3, array));
    }
}
