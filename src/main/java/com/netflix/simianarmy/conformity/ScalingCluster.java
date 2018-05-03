package com.netflix.simianarmy.conformity;

import com.google.common.collect.Lists;
import org.apache.commons.lang.Validate;

import java.util.Collection;
import java.util.Collections;

public class ScalingCluster extends Cluster {
    private final Collection<AutoScalingGroup> autoScalingGroups = Lists.newArrayList();
    /**
     * Constructor.
     * @param name
     *          the name of the cluster
     * @param autoScalingGroups
     *          the auto scaling groups in the cluster
     */
    public ScalingCluster(String name, String region, AutoScalingGroup... autoScalingGroups) {
        Validate.notNull(name);
        Validate.notNull(region);
        Validate.notNull(autoScalingGroups);
        this.name = name;
        this.region = region;
        for (AutoScalingGroup asg : autoScalingGroups) {
            this.autoScalingGroups.add(asg);
        }
    }

    public Collection<AutoScalingGroup> getAutoScalingGroups() {
        return Collections.unmodifiableCollection(autoScalingGroups);
    }
}
