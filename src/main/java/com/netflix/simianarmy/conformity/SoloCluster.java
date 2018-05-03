package com.netflix.simianarmy.conformity;

import com.google.common.collect.Sets;
import org.apache.commons.lang.Validate;

import java.util.Collections;
import java.util.Set;

public class SoloCluster extends Cluster {
    private final Set<String> soloInstances = Sets.newHashSet();

    /**
     * Constructor.
     * @param name
     *          the name of the cluster
     * @param soloInstances
     *          the list of all instances
     */
    public SoloCluster(String name, String region, Set<String> soloInstances) {
        Validate.notNull(name);
        Validate.notNull(region);
        Validate.notNull(soloInstances);
        this.name = name;
        this.region = region;
        for (String soleInstance : soloInstances) {
            this.soloInstances.add(soleInstance);
        }
    }
    public Set<String> getSoloInstances() {
        return Collections.unmodifiableSet(soloInstances);
    }
}
