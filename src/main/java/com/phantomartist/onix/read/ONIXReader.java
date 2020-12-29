package com.phantomartist.onix.read;

import java.util.List;

import com.phantomartist.onix.ONIXException;

public interface ONIXReader {

    List<ProductSummary> summarize() throws ONIXException;
}
