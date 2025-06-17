/*
 * Copyright (c) 2025.
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * @author amanjain
 **/
public class UseStream {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Ravi", "Ankit", "Aman", "Raj", "Arjun", "Vikas");
        names = convertStrings(names);
        System.out.println(names);

        List<Integer> scores = Arrays.asList(45, 88, 62, 39, 70, 55, 91, 60);
        filterScores(scores);
    }

    private static List<String> convertStrings(List<String> names){
        return names.stream().filter(s -> s.startsWith("A"))
                .map(s -> s.toUpperCase())
                .sorted().toList();
    }

    private static void filterScores(List<Integer> scores){
        IntSummaryStatistics stats = scores.stream()
                .filter(s -> s >= 60)
                .mapToInt(s -> s)
                .summaryStatistics();
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
    }
}
