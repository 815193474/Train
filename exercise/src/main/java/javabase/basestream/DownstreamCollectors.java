package javabase.basestream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @Author luoguanzhong
 * @Data 2020-08-16 17:09
 */
public class DownstreamCollectors {
    public static class City{
        private String name,state;
        private int population;
        public City(String name,String state,int population){
            this.name = name;
            this.state = state;
            this.population = population;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        @Override
        public String toString() {
            return "City{" +
                    "name='" + name + '\'' +
                    ", state='" + state + '\'' +
                    ", population=" + population +
                    '}';
        }


        public static Stream<City> readCities(String fileName) throws IOException{
            return Files.lines(Paths.get(fileName)).map(l -> l.split(",")).map(a -> new City(a[0],a[1],Integer.parseInt(a[2])));
        }

    public static void main(String[] args) {
    }
    }
}
