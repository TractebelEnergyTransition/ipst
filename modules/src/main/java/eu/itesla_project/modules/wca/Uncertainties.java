/**
 * Copyright (c) 2016, All partners of the iTesla project (http://www.itesla-project.eu/consortium)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package eu.itesla_project.modules.wca;

import java.util.List;

/**
 *
 * @author Geoffroy Jamgotchian <geoffroy.jamgotchian at rte-france.com>
 */
public class Uncertainties {

    public final List<StochasticInjection> injections;
    public final double[][] reductionMatrix;
    public final double[] min;
    public final double[] max;
    public final double[] means;

    public Uncertainties(List<StochasticInjection> injections, int varCount) {
        this.injections = injections;
        reductionMatrix = new double[injections.size()][varCount];
        min = new double[varCount];
        max = new double[varCount];
        means = new double[injections.size()];
    }


}
