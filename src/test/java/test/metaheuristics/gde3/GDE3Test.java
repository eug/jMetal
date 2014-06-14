//  GDE3Test.java
//
//  Author:
//       Antonio J. Nebro <antonio@lcc.uma.es>
//
//  Copyright (c) 2014 Antonio J. Nebro
//
//  This program is free software: you can redistribute it and/or modify
//  it under the terms of the GNU Lesser General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  This program is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public License
//  along with this program.  If not, see <http://www.gnu.org/licenses/>.

package test.metaheuristics.gde3;

import jmetal.core.Algorithm;
import jmetal.core.SolutionSet;
import jmetal.experiments.settings.GDE3_Settings;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Created by Antonio J. Nebro on 12/06/14.
 */
public class GDE3Test {
    Algorithm algorithm_ ;

    @Test
    public void testNumberOfReturnedSolutionsInEasyProblem() throws IOException, ClassNotFoundException {
      algorithm_ = new GDE3_Settings("Kursawe").configure() ;

      SolutionSet solutionSet = algorithm_.execute() ;
    /*
      Rationale: the default problem is Kursawe, and usually GDE3; configured with standard
      settings return 100 solutions
     */
      assertTrue(solutionSet.size() >= 98) ;
    }
}