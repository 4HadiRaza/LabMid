package labmid;

import labmid.filters.AdmissionFilter;
import java.util.ArrayList;
import java.util.List;

public class AdmissionPipeline {
    private final List<AdmissionFilter> filters = new ArrayList<>(); // Store filters

    // Add a filter to the pipeline
    public void addFilter(AdmissionFilter filter) {
        filters.add(filter);
    }

    // Get all filters in the pipeline
    public List<AdmissionFilter> getFilters() {
        return filters;
    }
}
